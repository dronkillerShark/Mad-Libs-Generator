public class Butterfly extends Games{
    private String adjactive;
    private String color;
    private String thing;
    private String place;
    private String person;
    private String adjactive1;
    private String insect;
    private String food;
    private String verb;

    public Butterfly(){
        this.startNewGame();
    }

    private void startNewGame(){
        this.adjactive = getTheInput("adjactive");
        this.color = getTheInput("a color name");
        this.thing = getTheInput("a thing");
        this.place = getTheInput("a place name");
        this.person = getTheInput("person name");
        this.adjactive1 = getTheInput("adjactive");
        this.insect = getTheInput("insect name");
        this.food = getTheInput("a food name");
        this.verb = getTheInput("a verb");
        System.out.println("Last night I dreamed I was a " + adjactive+  " butterfly with " +  color+  
        " splocthes that looked like "+ thing+  " .I flew to " 
        +  place + " with my bestfriend and "+ person
        + " who was a " + adjactive1 +  " " 
        + insect + " .We ate some " 
        + food +  " when we got there and then decided to " + verb
        +  " and the dream ended when I said-- lets " + verb +  ".");
    }
}
