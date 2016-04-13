package eu.amidst.maventest;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

/**
 * Created by rcabanas on 08/04/16.
 */
public class Hellomaven {





    public static void main(String[] args) {

        run();
    }


    /**
     * run: example of a function using com.google.guava
     */

    public static void run() {


        System.out.println("module depending on com.google.guava");

        Multiset<String> multiset = HashMultiset.create();

        multiset.add("a");
        multiset.add("b");
        multiset.add("c");
        multiset.add("d");
        multiset.add("a");
        multiset.add("b");
        multiset.add("c");
        multiset.add("b");
        multiset.add("b");
        multiset.add("b");

        //print the occurrence of an element
        System.out.println("Occurrence of 'b' : "+multiset.count("b"));

        //print the total size of the multiset
        System.out.println("Total Size : "+multiset.size());





    }



}
