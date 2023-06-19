# FERN WEBSITE

## Description

API generation for a default website representing a virtual organization using fern.
https://www.buildwithfern.com/


## Generators

- Postman Collection: https://www.postman.com/exa-online/workspace/public/overview
- 

## Development

Duplicate the .env file and rename it to `dev.env`
```
$ source dev.env
$ fern generate --group local
```
  

## Publication

```
$ source prod.env
$ fern generate --group public