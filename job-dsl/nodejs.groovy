job('NodeJS Example') {
    scm {
        git('https://github.com/vanrajboricha/docker-demo') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('vanrajboricha')
            node / gitConfigEmail('vanraj723@gmail.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs')
    }
    steps {
        shell("npm install")
    }
}
