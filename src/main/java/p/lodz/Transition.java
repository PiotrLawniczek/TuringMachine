package p.lodz;

/**
 * Created by elawpio on 2017-12-19.
 */
public class Transition {
    private State name;
    private String transitionInput;
    private State tranistionWay;
    private String writingSymbol;
    private String headmovement;

    public Transition(State name, String transitionInput, State tranistionWay, String writingSymbol, String headmovement) {
        this.name = name;
        this.transitionInput = transitionInput;
        this.tranistionWay = tranistionWay;
        this.writingSymbol = writingSymbol;
        this.headmovement = headmovement;
    }
}
