#this is a script 
def call(Map config = [:]) {
   sh "echo welcome ${config.name} Today is ${config.day}"
}
