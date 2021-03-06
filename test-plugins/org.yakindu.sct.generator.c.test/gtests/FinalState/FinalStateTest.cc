/* Generated by YAKINDU Statechart Tools code generator. */

#include "gtest/gtest.h"
#include "FinalState.h"

#include "sc_timer_service.h"


static FinalState statechart;


//! The timers are managed by a timer service. */
static sc_unit_timer_service_t timer_service;
			
class FinalStateTest : public ::testing::Test{
	protected:
	virtual void SetUp() {
		finalState_init(&statechart);
		sc_timer_service_init(
			&timer_service,
			0,
			(sc_run_cycle_fp) &finalState_runCycle,
			false,
			200,
			&statechart
		);
	}
};


TEST_F(FinalStateTest, StatechartNameTest) {
	
	finalState_enter(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(finalState_isFinal(&statechart));
}


