/* Generated by YAKINDU Statechart Tools code generator. */

#include "gtest/gtest.h"
#include "LocalReactions.h"

#include "sc_timer_service.h"


static LocalReactions statechart;


//! The timers are managed by a timer service. */
static sc_unit_timer_service_t timer_service;
			
class LocalReactionsTest : public ::testing::Test{
	protected:
	virtual void SetUp() {
		localReactions_init(&statechart);
		sc_timer_service_init(
			&timer_service,
			0,
			(sc_run_cycle_fp) &localReactions_runCycle,
			false,
			200,
			&statechart
		);
	}
};


TEST_F(LocalReactionsTest, LocalReactionsTest) {
	
	localReactions_enter(&statechart);
	EXPECT_TRUE(localReactions_isStateActive(&statechart, LocalReactions_main_region_A));
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(localReactionsIface_get_x(&statechart)== 1l);
}


