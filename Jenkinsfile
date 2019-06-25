pipeline {
     agent any
     stages {
          stage("Build") {
               steps {
                    sh "./gradlew compileJava"  
                    step([$class: 'JacocoPublisher', 
                     execPattern: 'target/*.exec',
                     classPattern: 'target/classes',
                     sourcePattern: 'src/main/java',
                     exclusionPattern: 'src/test*'
                    ])                    
               }
          }
          stage("Unit test") {
               steps {
                    sh "./gradlew test"                   
               }
          }         
      }
}
