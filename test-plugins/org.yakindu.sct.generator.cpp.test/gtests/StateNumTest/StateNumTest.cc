/* Generated by YAKINDU Statechart Tools code generator. */
#include <string>
#include "gtest/gtest.h"
#include "HistoryWithoutInitialStep.h"
#include "sc_runner.h"
#include "sc_types.h"

namespace  {



//! The timers are managed by a timer service. */
static SctUnitRunner * runner;

class StateNumTest : public ::testing::Test{
	protected:
	
	HistoryWithoutInitialStep* statechart;
	
	virtual void SetUp() {
		statechart = new HistoryWithoutInitialStep();
		statechart->init();
		runner = new SctUnitRunner(
			statechart,
			false,
			200
		);
	}
	virtual void TearDown() {
		delete statechart;
		delete runner;
	}
	
	
};

	TEST_F(StateNumTest, stateNumTest) {
		
		statechart->enter();
		
		EXPECT_TRUE(statechart->numStates == 6);
		
		
		
		
}

}
