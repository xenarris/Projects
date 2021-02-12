package notebooks;

public class TestNotebook
{
    public static void main(String[] args)
    {
        // to be equals() must have equivalence relation

        Notebook notesForSomething1 = new Notebook("Notes 1", "Insert Content 1 here", "May Dow");
        Notebook notesForSomething2 = new Notebook("Notes 2", "Insert Content 2 here", "May Dow");
        Notebook notesForSomething3 = new Notebook("Notes 1", "Insert Content 3 here", "May Dow");
        Notebook notesForSomething4 = new Notebook("Notes 1", "Insert Content 5 here", "May Dow");
        Diary diaryForSomething1 = new Diary("Notes 1",
                "Insert content 4 here", "May Dow", "Secret here");

        System.out.println(notesForSomething1.equals(notesForSomething3));
        System.out.println(notesForSomething3.equals(notesForSomething4));
        System.out.println(notesForSomething1.equals(notesForSomething4));
    }
}
