package com.example.admin.bigkt.testclass.inter_face;

/**
 * @author 20888
 * @date 2019/5/13 15:25
 */
public class JavaButton implements JavaView{


    @Override
    public State getCurrentState() {
        return new ButtonState();
    }

    @Override
    public void restoreSate(State s) {

    }

    public class ButtonState implements State {

    }
}

