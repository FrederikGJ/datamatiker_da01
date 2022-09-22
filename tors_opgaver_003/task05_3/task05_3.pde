boolean jobsDone = false;

void setup()
{
    if (isJobDone() == false)
    {
        println("Job's done!");   
    }
}

boolean isJobDone()
{
    return jobsDone;    
}
