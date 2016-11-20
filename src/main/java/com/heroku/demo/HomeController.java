/*
 * Copyright 2015 Benedikt Ritter
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.heroku.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class HomeController {

	@RequestMapping("/")
	public String index() {
				
		return	 "index";
    }
	
		
	@RequestMapping("/dashboard")
	public String dashboard() {
				
		return	 "dashboard";
    }
	
	@RequestMapping("/deftema")
	public String deftema() {
				
		return	 "deftema";
    }
	@RequestMapping("/cadastratema")
	public String cadastraTema() {
				
		return	 "cadastratema";
    }
	@RequestMapping("/edittema")
	public String edittema() {
				
		return	 "cadastratema3";
    }
	
	@RequestMapping("/defbanca")
	public String defbanca() {
				
		return	 "defbanca";
    }
	
	@RequestMapping("/defbancaedit")
	public String defbancaedit() {
				
		return	 "defbancaedit";
    }
	
	@RequestMapping("/blankpage")
	public String blankpage() {
				
		return	 "blankpage";
    }
	
	@RequestMapping("/defineCronograma")
	public String defineCronograma() {
				
		return	 "defGronograma";
    }
	
	@RequestMapping("/cadastraCronograma")
	public String cadastraCronograma() {
				
		return	 "cadastraCronograma";
    }
	
	@RequestMapping("/configAluno")
	public String configAluno() {
				
		return	 "configAluno";
    }
	
	@RequestMapping("/defproposta")
	public String defproposta() {
				
		return	 "defproposta";
    }
	
	@RequestMapping("/novaProposta")
	public String novaProposta() {				
		return	 "novaProposta";
    }
	
	@RequestMapping("/listaProposta")
	public String listaProposta() {				
		return	 "listaProposta";
    }
	
}
