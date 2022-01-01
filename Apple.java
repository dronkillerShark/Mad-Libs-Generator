public class Apple extends Games{
    private String person;
    private String color;
    private String foods;
    private String adjective;
    private String thing;
    private String place;
    private String verb;
    private String adverb;
    private String food;
    private String things;
    
    public Apple(){
        this.startNewGame();
    }

    private void startNewGame(){
        this.person = getTheInput("person name");
        this.color = getTheInput("color");
        this.foods = getTheInput("food name");
        this.adjective = getTheInput("adjective name");
        this.thing = getTheInput("a thing");
        this.place = getTheInput("place name");
        this.verb = getTheInput("a verb");
        this.adverb = getTheInput("a adverb");
        this.food = getTheInput("food name");
        this.things = getTheInput("a thing");

        System.out.println("Today we picked apple from " + person + "'s Orchard. I had no idea there were so many different varieties of apples. I ate " 
        + color + " apples straight off the tree that tested like "
        + foods + ". Then there was a " + adjective + " apple that looked like a " 
        + thing + ".When our bag were full, we went on a free hay ride to "
        + place + " and back. It ended at a hay pile where we got to " + verb + " " 
        + adverb + ". I can hardly wait to get home and cook with the apples. We are going to make appple " +
        food + " and " + things + " pies!.");
    }
}
