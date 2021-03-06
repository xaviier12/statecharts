/* Generated by YAKINDU Statechart Tools code generator. */

#include "gtest/gtest.h"
#include "ValuedEvents.h"

#include "sc_timer_service.h"


static ValuedEvents statechart;


//! The timers are managed by a timer service. */
static sc_unit_timer_service_t timer_service;
			
class ValuedEventsTest : public ::testing::Test{
	protected:
	virtual void SetUp() {
		valuedEvents_init(&statechart);
		sc_timer_service_init(
			&timer_service,
			0,
			(sc_run_cycle_fp) &valuedEvents_runCycle,
			false,
			200,
			&statechart
		);
	}
};


TEST_F(ValuedEventsTest, valuedEventsTest) {
	
	valuedEvents_enter(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(strcmp(valuedEventsIface_get_myString(&statechart), "sct") == 0);
	valuedEventsIface_raise_integerEvent(&statechart, 23l);
	valuedEventsIface_raise_booleanEvent(&statechart, false);
	valuedEventsIface_raise_realEvent(&statechart, 20l);
	valuedEventsIface_raise_stringEvent(&statechart, "tool");
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(valuedEvents_isStateActive(&statechart, ValuedEvents_integer_region_D));
	EXPECT_TRUE(valuedEvents_isStateActive(&statechart, ValuedEvents_string_region_D));
	EXPECT_TRUE(valuedEvents_isStateActive(&statechart, ValuedEvents_boolean_region_D));
	EXPECT_TRUE(valuedEvents_isStateActive(&statechart, ValuedEvents_real_region_D));
	EXPECT_TRUE(valuedEventsIface_get_myInt(&statechart)== 23l);
	EXPECT_TRUE(valuedEventsIface_get_myBool(&statechart)== false);
	EXPECT_TRUE(valuedEventsIface_get_myReal(&statechart)== 20l);
	EXPECT_TRUE(strcmp(valuedEventsIface_get_myString(&statechart), "tool") == 0);
}


