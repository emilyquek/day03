package day03;

public class Link {
    
    //public void hit(Monster m) {
      //  m.damage(5);

    
    //}

    //public void hit(Box b) {
      //  b.setIntegrity(b.getIntegrity()-5);
    //}

    public void hit(Damageable d) {
        d.damage(3);
    }
}
