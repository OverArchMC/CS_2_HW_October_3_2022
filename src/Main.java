import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
        Utensil example = new Utensil();
        System.out.println(example.howManyProngs("fork"));
        System.out.println(example.howManyProngs("fork", true));
        System.out.println(example.thisWillReturnTrue());
    }
}
