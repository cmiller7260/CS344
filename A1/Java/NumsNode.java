import java.util.*;
//NumsNode:import//

// <nums>:NumsNode ::= LPAREN <nums>one RPAREN <nums>two
public class NumsNode extends Nums {

    public Nums one;
    public Nums two;

    public NumsNode(Nums one, Nums two) {
        this.one = one;
        this.two = two;
    }

    public static NumsNode parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<nums>:NumsNode", scn$.lno);
        scn$.match(Token.Val.LPAREN, trace$);
        Nums one = Nums.parse(scn$, trace$);
        scn$.match(Token.Val.RPAREN, trace$);
        Nums two = Nums.parse(scn$, trace$);
        return new NumsNode(one, two);
    }


	// toString semantics for a NumsNode object
	public String toString() {
		return " " + one.toString() + two.toString();
	}


}
