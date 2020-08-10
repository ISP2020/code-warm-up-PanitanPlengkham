import java.io.*;

public class Counter {
    private int count;
    private double total;

    public void readfile (String filename) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = bufferedReader.readLine())!= null) {
                if (line.startsWith("#")){
                    continue;
                }
                if (line.isEmpty())
                    continue;
                count += 1;
                double value = Double.parseDouble(line);
                total += value;

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public int getCount(){
        return count;
    }

    public double getTotal() {
        return total;
    }
}
