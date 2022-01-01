public class Photo extends Games{
     private String food;
     private String name;
     private String place;
     private String animals;
     private String profession;
     private String things;
     private String cloth;
     private String verb;

     public Photo(){
          this.startNewGame();
     }

     private void startNewGame(){
          this.food = getTheInput("food name");
          this.name = getTheInput("name");
          this.place = getTheInput("place name");
          this.animals = getTheInput("animal name");
          this.profession = getTheInput("profession name");
          this.things = getTheInput("thing name");
          this.cloth = getTheInput("cloth name");
          this.verb = getTheInput("verb name");

          System.out.println("say " + food + ", the photographer said as the camera flashed! " + 
          name + " and I had gone to " 
          + place + " to get our photos taken on my birthday. " +
          "The first photo we really wanted was a picture of us dressed as " +
           animals + " pretending to be a " + 
           profession + ". when we saw the second photo, it was exactly what I wanted. We both looked like " + things + " wearing " + cloth + " and " + verb + " --exactly what I had in mind");
     }
}
