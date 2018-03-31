package com.example.demo.rules;

import org.easyrules.api.RulesEngine;
import org.easyrules.core.RulesEngineBuilder;

public class FizzBuzzWithEasyRules {

    public static void main(String[] args) {

        // create rules engine
        RulesEngine fizzBuzzEngine =
                RulesEngineBuilder.aNewRulesEngine()
                        .withSkipOnFirstAppliedRule(false) // 如果第一个规则满足条件，后面的规则将不再执行
                        .withSilentMode(true)
                        .build();

        System.out.println("===================================");
        // create rules
        FizzRule fizzRule = new FizzRule();
        FizzRule2 fizzRule2 = new FizzRule2();
        BuzzRule buzzRule = new BuzzRule();
        FizzBuzzRule fizzBuzzRule = new FizzBuzzRule(fizzRule, buzzRule);
        NonFizzBuzzRule nonFizzBuzzRule = new NonFizzBuzzRule();
//
//        // register rules
        fizzBuzzEngine.registerRule(fizzRule);
        fizzBuzzEngine.registerRule(fizzRule2);
        fizzBuzzEngine.registerRule(buzzRule);
        fizzBuzzEngine.registerRule(fizzBuzzRule);
        fizzBuzzEngine.registerRule(nonFizzBuzzRule);
//
        // fire rules
        for (int i = 1; i <= 35; i++) {
            fizzRule.setInput(i);
            fizzRule2.setInput(i);
            buzzRule.setInput(i);
            nonFizzBuzzRule.setInput(i);
            fizzBuzzEngine.fireRules();
            System.out.println("-----------------"+i);
        }
    }
}