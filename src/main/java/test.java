import java.text.DecimalFormat;

/**
 * Project name(项目名称)：Double类
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/31
 * Time(创建时间)： 20:39
 * Version(版本): 1.0
 * Description(描述)：
 * Double 类的构造方法
 * Double 类中的构造方法有如下两个。
 * Double(double value)：构造一个新分配的 Double 对象，它表示转换为 double 类型的参数。
 * Double(String s)：构造一个新分配的 Double 对象，它表示 String 参数所指示的 double 值。
 * Double类中的常用方法
 * 方法	       返回值	功能
 * byteValue()	byte	以 byte 类型返回该 Double 的值
 * doubleValue()	double	以 double 类型返回该 Double 的值
 * fioatValue()	float	以 float 类型返回该 Double 的值
 * intValue()	int	以 int 类型返回该 Double 的值（强制转换为 int 类型）
 * longValue()	long	以 long 类型返回该 Double 的值（强制转换为 long 类型）
 * shortValue()	short	以 short 类型返回该 Double 的值（强制转换为 short 类型）
 * isNaN()	boolean	如果此 Double 值是一个非数字值，则返回 true，否则返回 false
 * isNaN(double v)	boolean	如果指定的参数是一个非数字值，则返回 true，否则返回 false
 * toString()	String	返回一个表示该 Double 值的 String 对象
 * valueOf(String s)	Double	返回保存指定的 String 值的 Double 对象
 * parseDouble(String s)	double	将数字字符串转换为 Double 数值
 * Double 类的常用常量
 * MAX_VALUE:值为 1.8E308 的常量，它表示 double 类型的最大正有限值的常量。
 * MIN_VALUE：值为 4.9E-324 的常量，它表示 double 类型数据能够保持的最小正非零值的常量。
 * NaN：保存 double 类型的非数字值的常量。
 * NEGATIVE_INFINITY：保持 double 类型的负无穷大的常量。
 * POSITIVE_INFINITY：保持 double 类型的正无穷大的常量。
 * SIZE：用秦以二进制补码形式表示 double 值的比特位数。
 * TYPE：表示基本类型 double 的 Class 实例。
 */

@SuppressWarnings("all")
public class test
{
    public static double getDoubleRandom(double min, double max)  //double型随机数
    {
        if (min > max)
        {
            min = max;
        }
        return min + (Math.random() * (max - min));
    }

    public static double getDoubleRandom(double min, double max, String format)
    {            //空间复杂度和时间复杂度都特别高，只适合获取非常少的格式化的随机数使用。farmat：##.##或00.00
        DecimalFormat decimalFormat = new DecimalFormat(format);
        if (min > max)
        {
            min = max;
        }
        return Double.parseDouble(decimalFormat.format(min + (Math.random() * (max - min))));
    }

    public static void main(String[] args)
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        Double double1 = new Double(568.245789);
        Double double2 = new Double("3687.245786");
        System.out.println(double1);
        System.out.println(double2);
        System.out.println(double2.byteValue());
        System.out.println(double2.shortValue());
        System.out.println(double2.floatValue());
        System.out.println(double2.longValue());
        double data1 = Double.parseDouble("3283.24764");
        double data2 = Double.valueOf("32587.2556");
        System.out.println(data1);
        System.out.println(data2);
        double data3 = getDoubleRandom(10, 50.5);
        String str1 = Double.toString(data3);
        System.out.println(str1);
        System.out.println(Double.SIZE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MIN_NORMAL);
        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println(Double.NEGATIVE_INFINITY);
        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
            double final_runtime;
            final_runtime = (endTime - startTime);
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "毫秒");
        }
        else
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 10000;
            final_runtime = final_runtime / 100000;
            System.out.println("算法运行时间： " + final_runtime + "秒");
        }
        Runtime r = Runtime.getRuntime();
        float memory;
        memory = r.totalMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("JVM总内存：%.3fMB\n", memory);
        memory = r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf(" 空闲内存：%.3fMB\n", memory);
        memory = r.totalMemory() - r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("已使用的内存：%.4fMB\n", memory);
        //------------------------------------------------------
    }
}
