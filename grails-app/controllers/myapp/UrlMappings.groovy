package myapp

class UrlMappings {

    static mappings = {
        "/$controller/$action" {
            constraints {}
        }

        "/"(controller: 'application', action:'index')
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
