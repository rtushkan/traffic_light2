import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class TrafficLight {

  private   ArrayList<Color> colors;

    public ArrayList<Color> getColors() {
        return colors;
    }

    public TrafficLight() {
        colors = new ArrayList<>();

    }
    public TrafficLight(Color... colors)
    {
        this.colors = new ArrayList<>(Arrays.asList(colors));

    }

    public void setStandard()
    {
        colors.add(new Color("Зелёный",2));
        colors.add(new Color("Желтый",3));
        colors.add(new Color("Красный",5));

    }
    public void getResult() {

        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Введите время (минуты) или Exit для выхода : ");
            try {
               String timeExit = in.readLine();
               if (timeExit.toUpperCase().equals("exit".toUpperCase()))
                   return;
               int time = Integer.parseInt(timeExit);
               System.out.println("Горит - " + result(time)+" свет.");
               getResult();
            }
            catch (NumberFormatException e)
            {
                System.out.println("Требуется число.");
                getResult();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private String result(int time) ////
    {
        int allTime=0; //общее время 1 цикла
        int temp2 = 0;
        String result = "";

        for(int x = 0; x< colors.size(); x++)
        {
           allTime+= colors.get(x).getTimeOn();
        }
        int temp1 = time -(allTime*(time/allTime)); //время последней последовательности цветов
        System.out.println(temp1);
        for(int x = 0; x< colors.size(); x++)
        {
            temp2 += colors.get(x).getTimeOn();
            if (temp1-temp2<0)
            {
                result = colors.get(x).getName();
            break;
            }

        }
        return result;//тест коммитов
    }


}
