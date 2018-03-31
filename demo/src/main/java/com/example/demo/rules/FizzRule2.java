package com.example.demo.rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Priority;
import org.easyrules.annotation.Rule;

@Rule
public class FizzRule2 {

    private int input;

    @Condition
    public boolean isFizz() {
        return input % 5 == 0;
    }

    @Action
    public void printFizz() {
        System.out.print("fizz2-");
    }

    public void setInput(int input) {
        this.input = input;
    }

    @Priority
    public int getPriority() {
        return 2;
    }
}

