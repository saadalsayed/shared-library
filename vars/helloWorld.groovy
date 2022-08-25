def call(Map cmy-config = [:]) {
   sh "echo welcome ${my-config.name} Today is ${my-config.day}"
}
