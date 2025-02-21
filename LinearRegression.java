public class LinearRegression {

    public static double calcM(double[][] data){
        int length = data.length;
        double xsum = 0, ysum = 0, xysum = 0, x2sum = 0;

        for (double[] pt : data){
            double x = pt[0];
            double y = pt[1];
            xsum += x;
            ysum += y;
            xysum += x * y;
            x2sum += x*x;




        }

        return (length * xysum - xsum * ysum) / ( length * x2sum - xsum * xsum);


    }

    public static double calcB(double[][] data) {
        int length = data.length;
        double xsum = 0, ysum = 0;

        for (double[] point : data) {
            xsum += point[0];
            ysum += point[1];
        }

        double xmean = xsum / length;
        double ymean = ysum / length;

        double m = calcM(data);
        return ymean - m * xmean;
    }
    
}
