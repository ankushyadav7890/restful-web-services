package com.ankush.rest.webservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {

	@GetMapping("/v1/person")
	public PersonV1 getFirstVersiobOfPerson() {
		return new PersonV1("Ankush Yadav");
	}

	@GetMapping("/v2/person")
	public PersonV2 getSecondVersiobOfPerson() {
		return new PersonV2(new Name("Ankush", "Yadav"));
	}

	@GetMapping(path = "/person", params = "version=1")
	public PersonV1 getFirstVersiobOfPersonRequestParameter() {
		return new PersonV1("Ankush Yadav");
	}

	@GetMapping(path = "/person", params = "version=2")
	public PersonV2 getSecondVersiobOfPersonRequestParameter() {
		return new PersonV2(new Name("Ankush", "Yadav"));
	}

	@GetMapping(path = "/person/header", headers = "X-API-VERSION=1")
	public PersonV1 getFirstVersiobOfPersonRequestHeader() {
		return new PersonV1("Ankush Yadav");
	}

	@GetMapping(path = "/person/header", headers = "X-API-VERSION=2")
	public PersonV2 getSecondVersiobOfPersonRequestHeader() {
		return new PersonV2(new Name("Ankush", "Yadav"));
	}
	@GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v1+json")
	public PersonV1 getFirstVersiobOfPersonAcceptHeader() {
		return new PersonV1("Ankush Yadav");
	}
	@GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v2+json")
	public PersonV2 getSecondVersiobOfPersonAcceptHeader() {
		return new PersonV2(new Name("Ankush", "Yadav"));
	}
}
