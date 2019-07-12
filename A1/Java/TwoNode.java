import java.util.*;
//TwoNode:import//

// <two>:TwoNode ::= LPAREN <two> RPAREN
public class TwoNode extends Two {

    public Two two;

    public TwoNode(Two two) {
        this.two = two;
    }

    public static TwoNode parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<two>:TwoNode", scn$.lno);
        scn$.match(Token.Val.LPAREN, trace$);
        Two two = Two.parse(scn$, trace$);
        scn$.match(Token.Val.RPAREN, trace$);
        return new TwoNode(two);
    }

//TwoNode//

}
