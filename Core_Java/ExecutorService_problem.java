import java.util.concurrent.*;

class ExecutorServiceDemo
{
    static class A
    {
        public String getMethod()
        {
            return "A.getMethod";
        }
    }
    static class B
    {
        public String getMethod()
        {
            return "B.getMethod";
        }
    }

    public String runSameTime()
    {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        String result = null;
        try
        {
            Future<String> a = executorService.submit(()-> new A().getMethod());
            Future<String> b = executorService.submit(()-> new B().getMethod());

            while (true)
            {
                if(a.isDone() && b.isDone())
                {
                    break;
                }
            }
            result = b.get() + " " + a.get();
        }
        catch(InterruptedException | ExecutionException interruptedException)
        {
            interruptedException.printStackTrace();
        }
        finally {
            executorService.shutdown();
        }

        return result;

    }
}

public class ExecutorService_problem
{
    public static void main(String[] args)
    {
        ExecutorServiceDemo executorServiceDemo = new ExecutorServiceDemo();
        System.out.println(executorServiceDemo.runSameTime());
    }
}
