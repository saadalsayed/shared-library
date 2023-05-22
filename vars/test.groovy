def call(Map config = [:]) {
   sh "echo welcome ${config.name} Today is ${config.day}"
}
