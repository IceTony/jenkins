def call() {
    sh(script: "git clean -fdx")
    sh(script: "npm install")
    sh(script: "npm run build")
}