{
	"info": {
		"_postman_id": "d7026b93-df02-42e0-a7ea-b2ecf17b272b",
		"name": "Interview Task",
		"schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json",
		"_exporter_id": "43822168"
	},
	"item": [
		{
			"name": "New Request",
			"request": {
				"auth": {
					"type": "basic",
					"basic": [
						{
							"key": "password",
							"value": "admin@123456",
							"type": "string"
						},
						{
							"key": "username",
							"value": "siddiqshaikh1@nimapinfotech.com",
							"type": "string"
						}
					]
				},
				"method": "GET",
				"header": [],
				"url": {
					"raw": "{{Base URL}}/auth/login",
					"host": [
						"{{Base URL}}"
					],
					"path": [
						"auth",
						"login"
					]
				}
			},
			"response": []
		},
		{
			"name": "New Request",
			"protocolProfileBehavior": {
				"disabledSystemHeaders": {}
			},
			"request": {
				"auth": {
					"type": "noauth"
				},
				"method": "POST",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n    \"Username\":\"{{Username}}\"\r\n    \"Password\":\"{{Password}}\"\r\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "{{Base URL}}/auth/login",
					"host": [
						"{{Base URL}}"
					],
					"path": [
						"auth",
						"login"
					]
				}
			},
			"response": []
		}
	]
}
