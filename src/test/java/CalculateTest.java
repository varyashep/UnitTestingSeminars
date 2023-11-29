import org.example.Calculate;

public class CalculateTest {
    public static void main(String[] args){
        int[] list1 = {1,2,3,7};
        int[] list2 = {2,4,8,11};

        Calculate calculate = new Calculate();
        calculate.CompareAverage(list1,
                list2);

        assert 3 == calculate.GetAverage(list1);
        assert 6 == calculate.GetAverage(list2);

    }
}
