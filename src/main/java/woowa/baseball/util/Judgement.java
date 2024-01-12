package woowa.baseball.util;

public enum Judgement {
    STRIKE("스트라이크"),
    BALL("볼"),
    NOTHING("낫싱");

    private String judgement;

    Judgement(String judgement) {
        this.judgement = judgement;
    }

    public String getJudgement() {
        return judgement;
    }
}
