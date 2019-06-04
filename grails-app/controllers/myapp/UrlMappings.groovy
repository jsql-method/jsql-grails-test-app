package myapp

class UrlMappings {

    static mappings = {

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/api/jsql/$action?"(controller: "jsql")

        "/"(controller: 'application', action:'index')

        "500"(view: '/error')
        "404"(view: '/notFound')

    }

}
