class Fruit
{
 private String fruitName;
 private boolean isSeeded;
 private char vitamin;
 public Fruit(){fruitName="Not Available"; isSeeded=false; vitamin='N';}
 public Fruit(String fruitName,boolean isSeeded,char vitamin)
 {
  this.fruitName=fruitName;
  this.isSeeded=isSeeded;
  this.vitamin=vitamin;
 }
public void display()
{
 if(isSeeded)
 System.out.println("Seeded fruit "+fruitName+" contains Vitamin "+vitamin);
}

}