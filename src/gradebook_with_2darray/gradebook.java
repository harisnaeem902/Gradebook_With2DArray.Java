
package gradebook_with_2darray;

public class gradebook 
{
     private String courseTitle;
    private double[][] marks;
    public gradebook(String ct, double [][] t)
    {
        this.setCourseTitle(ct);
        this.setMarks(t);
    }
    public void setMarks(double[][] t)
    {
        this.marks=t;
    }
    public double[][] getMarks()
    {
        return this.marks;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }
    public void processGrade()
    {
        System.out.printf("Welcome to the GradeBook of %s\n",this.getCourseTitle());
        this.printGrade();
    }
    private double computeAvg(double [] t)
    {
        double avg=0.0;
        for(double itm:t)
        {
            avg+=itm;
        }
        return avg/t.length;
    }
    private double findMax()
    {
        double max=this.marks[0][0];
        for(int i=0; i<this.marks.length; i++)
        {
            for(int j=0; j<this.marks[i].length; j++)
            {
                if(this.marks[i][j]>max)
                {
                    max=this.marks[i][j];
                }
            }
        }
        return max;
    }
        private double findAvg()
    {
        double avg=0.0;
        for(int i=0; i<this.marks.length; i++)
        {
            for(int j=0; j<this.marks[i].length; j++)
            {
                avg+=this.marks[i][j];
            }
        }
        avg=avg/(this.marks.length*this.marks[0].length);
        return avg;
    }
        private double findMin()
    {
        double min=this.marks[0][0];
        for(int i=0; i<this.marks.length; i++)
        {
            for(int j=0; j<this.marks[i].length; j++)
            {
                if(this.marks[i][j]<min)
                {
                    min=this.marks[i][j];
                }
            }
        }
        return min;
    }
    
        
    private void printGrade()
    {
      for(int i=0; i<this.marks[0].length; i++)
      {
          System.out.printf("%15s%2d", "Test#",i+1);
      }
      System.out.printf("%17s", "Average");
      System.out.println();
      for(int i=0;i<this.marks.length;i++)
      {
          System.out.printf("%8s%d","Student ",i+1);
          for(int j=0; j<this.marks[i].length; j++)
          {
              if(j==0)
              {
                  System.out.printf("%8.2f",this.marks[i][j]);
              }
              else
              System.out.printf("%17.2f",this.marks[i][j]);
          }
          double ag=this.computeAvg(this.marks[i]);
          System.out.printf("%17.2f", ag);
          System.out.println();
      }
      System.out.println("--------------------------------------------------");
      System.out.printf("Max: %f\n",this.findMax());
      System.out.printf("Min: %f\n",this.findMin());
      System.out.printf("Avg: %f\n",this.findAvg());
      System.out.println("--------------------------------------------------");
    }
}
