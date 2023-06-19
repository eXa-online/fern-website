# This file was auto-generated by Fern from our API Definition.

import typing

from .resources.v_1.client import AsyncV1Client, V1Client


class WebsiteClient:
    def __init__(
        self, *, environment: str, username: typing.Optional[str] = None, password: typing.Optional[str] = None
    ):
        self._environment = environment
        self._username = username
        self._password = password
        self.v_1 = V1Client(environment=self._environment, username=self._username, password=self._password)


class AsyncWebsiteClient:
    def __init__(
        self, *, environment: str, username: typing.Optional[str] = None, password: typing.Optional[str] = None
    ):
        self._environment = environment
        self._username = username
        self._password = password
        self.v_1 = AsyncV1Client(environment=self._environment, username=self._username, password=self._password)