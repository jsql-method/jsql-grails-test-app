package myapp

import grails.converters.JSON

class TestController  {

    static responseFormats = ['json']
	
    def index() {
        def data = [ status: 200 ]
        render data as JSON
    }

}
