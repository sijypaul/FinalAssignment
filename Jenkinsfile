pipeline
{
    agent any
    stages 
    {
        stage('git repo & clean') 
        {
            steps
            {
             
              //bat "git clone https://github.com/sijypaul/FinalAssignment.git"
               bat "mvn clean -f FinalAssignment "
            }
        }
       
        stage('package')
        {
            steps 
            {
                bat "mvn package -f FinalAssignment "
            }
        }
    }
}
