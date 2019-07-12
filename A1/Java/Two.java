import java.util.*;
//Two:import//

public abstract class Two {

    public static Two parse(Scan scn$, Trace trace$) {
        Token t$ = scn$.cur();
        Token.Val v$ = t$.val;
        switch(v$) {
        case RPAREN:
        case ATSIGN:
            return TwoNull.parse(scn$,trace$);
        case LPAREN:
            return TwoNode.parse(scn$,trace$);
        default:
            throw new RuntimeException("Two cannot begin with " + v$);
        }
    }

//Two//

}
