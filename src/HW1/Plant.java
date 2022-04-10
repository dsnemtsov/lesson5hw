package HW1;

import java.util.Objects;

public abstract class Plant implements Growing{
    double height;
    double width;

    Plant() {
    }

    Plant(double h, double w) {
      height = h;
      width = w;
    }

    public void grow() {
      System.out.println("Я расту");
    }

    @Override
    public String toString() {
      return "Plant{" +
              "height=" + height +
              ", width=" + width +
              '}';
    }

    @Override
    public int hashCode() {
      return Objects.hash(height, width);
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof Plant)) return false;
      return hashCode()==o.hashCode();
    }
}
