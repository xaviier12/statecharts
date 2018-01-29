package org.yakindu.sct.generator.pax

import com.google.inject.Inject
import org.yakindu.sct.model.sexec.ExecutionFlow
import org.yakindu.sct.model.sexec.TimeEvent
import org.yakindu.sct.model.sexec.naming.INamingService
import org.yakindu.sct.model.sgen.GeneratorEntry
import org.yakindu.sct.model.sgraph.Scope
import org.yakindu.sct.model.stext.stext.EventDefinition
import org.yakindu.sct.model.stext.stext.InternalScope
import org.yakindu.sct.model.stext.stext.VariableDefinition
import java.util.List
import org.yakindu.sct.model.sexec.Step

class PaxApplication implements IContentTemplate {

	@Inject extension PaxNaming;
	@Inject extension INamingService

	override content(ExecutionFlow flow, GeneratorEntry entry, IGenArtifactConfigurations locations) {
		'''
			�StatesEnum(flow)�
			
			�StatemachineVariables(flow)�
			 
			�FOR s : flow.scopes�
				�s.scopeVarDecl�
				�s.scopeConstDecl�
			�ENDFOR�
			
			�initAndEnterFunctino(flow)�
			
			�runCycleFunction(flow)�
			
			�periodicRunCylceTrigger(flow)�
			
			�functionImplementations(flow)�
			
			�Events�
		'''
	}
	
	def functionImplementations(ExecutionFlow flow) {

	}
	
		def toImplementation(List<Step> steps) '''
		�FOR s : steps�
			
		�ENDFOR�
	'''

	def periodicRunCylceTrigger(ExecutionFlow flow) {
		'''
			�every� �timeTrigger� {
				�runCycleFunctionName�();
			}
		'''
	}
	
	

	def StatemachineVariables(ExecutionFlow flow) {
		'''
			�variablePrefix� initialized = 0;
			�variablePrefix� activeState : �enumName(flow)�;
		'''
	}

	def initAndEnterFunctino(ExecutionFlow flow) {
		val defaultTimeTrigger = "100 " + PaxTypes.MS.unit;
//		TODO handle trigger time for Statemachine correctly
		'''
			�functionPrefix� �initAndEnterFunctionName�() {
				
				�timeTrigger = defaultTimeTrigger�
				initialized = 1;
			}
		'''
	}

	def runCycleFunction(ExecutionFlow flow) {
		'''
			�functionPrefix� �runCycleFunctionName�() {
				if(initialized == 0) {
					�initAndEnterFunctionName�()
				}
				�runCycleIfElse(flow)�
			}
		'''
	}
	
	def runCycleIfElse(ExecutionFlow it) {
		'''
			�FOR state: states�
				else if (�enumName�.�state.shortName� == activeState){
					// do sth
				}
			�ENDFOR�
		'''
	}

	def scopeVarDecl(Scope s) {
		'''
			// Declare used variables
			�val vars = s.typeRelevantDeclarations�
			�FOR variable : vars�
				�variablePrefix� �variable.name�
			���		TODO add initial values
		�ENDFOR�
		'''
	}

	def scopeConstDecl(Scope s) {
		'''
			�val consts = s.constDeclarations�
			�FOR constant : consts�
				�variablePrefix� �constant.name� = �constant�
			���		TODO add initial values
		�ENDFOR�
		'''
	}

	private def typeRelevantDeclarations(Scope scope) {
		return scope.declarations.filter [
			switch it {
				EventDefinition: true
				TimeEvent: true
				VariableDefinition: !it.const
				default: false
			}
		]
	}

	private def constDeclarations(Scope scope) {
		return scope.declarations.filter(typeof(VariableDefinition)).filter[const]
	}

	def Events() {
		'''
			
		'''
	}

	def StatesEnum(ExecutionFlow it) {
		'''
			enum �enumName� {
				�FOR state : states SEPARATOR ","�
					�state.shortName�
				�ENDFOR�
			}
		'''
	}

}