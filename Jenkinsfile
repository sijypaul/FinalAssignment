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
                //bat "mvn clean install package -f FinalAssignment "
                echo "java -jar FinalAssignment/target/Employee-Management-System-Springboot-Project-0.0.1-SNAPSHOT.jar"
            }
        }
        
         stage('Docker Image')
        {
            steps 
            {
                echo 'docker build -t springio/Employee-Management-System-Springboot-Project-0.0.1-SNAPSHOT.jar-openjdk:11-alpine'

            }
        }
    }
}
