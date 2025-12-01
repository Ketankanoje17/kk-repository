class MinMax {

  public int Max(int[] maxvalue) {
    int maximum = maxvalue[0];

    for (int i = 0; i < maxvalue.length; i++) {
      if (maxvalue[i] > maximum) {
        maximum = maxvalue[i];
      }
    }
    return maximum;
  }

  public int Min(int[] minValue) {
    int minimum = minValue[0];

    for (int i = 0; i < minValue.length; i++) {
      if (minValue[i] < minimum) {
        minimum = minValue[i];
      }
    }
    return minimum;
  }

  public static void main(String args[]) {
    int[] minmax1 = { 23, 55, 67, 19, 99 };
    MinMax m = new MinMax();

    System.out.println("Maximum number is given:  " + m.Max(minmax1));
    System.out.println("Minimum number is given:  " + m.Min(minmax1));

  }
}