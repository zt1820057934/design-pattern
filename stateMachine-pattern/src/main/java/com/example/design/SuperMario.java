package com.example.design;

/**
 * SuperMario.
 * 超级马里奥
 * @author zhangteng 2/17/21
 */
public class SuperMario implements IMario {

    private MarioStateMachine stateMachine;

    public SuperMario(MarioStateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    public State getName() {
        return State.SUPER;
    }

    public void obtainMushRoom() {
        // do nothing
    }

    public void obtainCape() {
        // stateMachine.setCurrentState(new CapeMario(stateMachine));
        stateMachine.setScore(stateMachine.getScore() + 200);
    }

    public void obtainFireFlower() {
        // stateMachine.setCurrentState(new FireMario(stateMachine));
        stateMachine.setScore(stateMachine.getScore() + 300);
    }

    // 遇见怪物，回退到小马里奥
    public void meetMonster() {
        stateMachine.setCurrentState(new SmallMario(stateMachine));
        stateMachine.setScore(stateMachine.getScore() - 100);
    }
}
