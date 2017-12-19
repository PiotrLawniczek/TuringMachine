package p.lodz;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by elawpio on 2017-12-19.
 */
public class Main {
    public static void main(String[] args) {

        State q0 = new State("q0");
        State q1 = new State("q1");
        State q2 = new State("q2");
        State q3 = new State("q3");
        State q4 = new State("q4");
        State q5 = new State("q5");
        State q6 = new State("q6");
        State q7 = new State("q7");

        Transition t0 = new Transition(q0,"#",q7,"#", "R" );
        Transition t1 = new Transition(q0,"a",q7,"#", "R" );
        Transition t2 = new Transition(q0,"b",q7,"#", "R" );

        Transition t3 = new Transition(q1,"#",q2,"#", "L" );
        Transition t4 = new Transition(q1,"a",q1,"a", "R" );
        Transition t5 = new Transition(q1,"b",q1,"b", "R" );

        Transition t6 = new Transition(q2,"#",q7,"#", "L" );
        Transition t7 = new Transition(q2,"a",q3,"#", "R" );
        Transition t8 = new Transition(q2,"b",q6,"b", "" );

        Transition t9 = new Transition(q3,"#",q0,"#", "R" );
        Transition t10 = new Transition(q3,"a",q3,"a", "L" );
        Transition t11 = new Transition(q3,"b",q3,"b", "L" );

        Transition t12 = new Transition(q4,"#",q5,"#", "L" );
        Transition t13 = new Transition(q4,"a",q4,"a", "R" );
        Transition t14 = new Transition(q4,"b",q4,"b", "R" );

        Transition t15 = new Transition(q5,"#",q7,"#", "" );
        Transition t16 = new Transition(q5,"a",q6,"a", "" );
        Transition t17 = new Transition(q5,"b",q3,"#", "L" );

        Transition t18 = new Transition(q6,"",null,"", "" );
        Transition t19 = new Transition(q6,"",null,"", "" );
        Transition t20 = new Transition(q6,"",null,"", "" );

        Transition t21 = new Transition(q7,"",null,"", "" );
        Transition t22 = new Transition(q7,"",null,"", "" );
        Transition t23 = new Transition(q7,"",null,"", "" );



    }


}
