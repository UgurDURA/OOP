package SingleResponsibilityPrincipleSRP;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Journal
{
    private final List<String> entries = new ArrayList<>();
    private static int count = 0;

    public void addEntry(String text)
    {
        entries.add(" "+ (++count)+" : "+ text);

    }
    public void removeEntry(int index)
    {
        entries.remove(index);
    }

    @Override
    public String toString() {
        return  String.join(System.lineSeparator(),entries);
    }


    public void load(String filename)
    {

    }
    public void load(URL url)
    {

    }
}
class Persistence
{
    public void saveToFile(Journal journal,String filename, boolean overWrite) throws FileNotFoundException {
        if(overWrite || new File(filename).exists())
        {
            try(PrintStream out = new PrintStream(filename))
            {
                out.println(toString());
            }
        }
    }
}

class Demo
{
    public static void main(String[] args) throws Exception {
        Journal j = new Journal();
        j.addEntry("I cried today");
        j.addEntry("I studied today");
        System.out.println(j);

        Persistence p = new Persistence();
        String filename = "" + "/Users/ugur_dura/Desktop/OOP/journal.rtf";
        p.saveToFile(j,filename,true);

        Runtime.getRuntime().exec("textEdit.dmg"+filename);
    }
}
