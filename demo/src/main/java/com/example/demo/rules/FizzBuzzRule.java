package com.example.demo.rules;

import org.easyrules.core.CompositeRule;

public class FizzBuzzRule extends CompositeRule {

//    public FizzBuzzRule(Object... rules) {
//        for (Object rule : rules) {
//            addRule(rule);
//        }
//    }
    public FizzBuzzRule(FizzRule fizzRule,BuzzRule buzzRule) {
        addRule(fizzRule);
        addRule(buzzRule);
    }

    @Override
    public int getPriority() {
        return 0;
    }
}

