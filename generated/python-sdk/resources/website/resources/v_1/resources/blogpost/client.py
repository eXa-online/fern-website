# This file was auto-generated by Fern from our API Definition.

import typing
import urllib.parse
from json.decoder import JSONDecodeError

import httpx
import pydantic

from .......core.api_error import ApiError
from .......core.jsonable_encoder import jsonable_encoder
from ......commons.errors.bad_request_error import BadRequestError
from ......commons.errors.not_found_error import NotFoundError
from ......fixtures.resources.blogpost.types.blog_post import BlogPost
from ......fixtures.resources.blogpost.types.blog_post_collection import BlogPostCollection
from ......fixtures.resources.blogpost.types.blog_post_slug import BlogPostSlug
from ......fixtures.resources.blogpost.types.create_blog_post_request import CreateBlogPostRequest
from .errors.blog_post_does_not_exist_error import BlogPostDoesNotExistError


class BlogpostClient:
    def __init__(
        self, *, environment: str, username: typing.Optional[str] = None, password: typing.Optional[str] = None
    ):
        self._environment = environment
        self._username = username
        self._password = password

    def get_blogposts(self) -> BlogPostCollection:
        _response = httpx.request(
            "GET",
            urllib.parse.urljoin(f"{self._environment}/", "blog"),
            auth=(self._username, self._password)
            if self._username is not None and self._password is not None
            else None,
            timeout=60,
        )
        if 200 <= _response.status_code < 300:
            return pydantic.parse_obj_as(BlogPostCollection, _response.json())  # type: ignore
        if _response.status_code == 404:
            raise NotFoundError()
        if _response.status_code == 400:
            raise BadRequestError()
        try:
            _response_json = _response.json()
        except JSONDecodeError:
            raise ApiError(status_code=_response.status_code, body=_response.text)
        raise ApiError(status_code=_response.status_code, body=_response_json)

    def get_blog_post(self, slug: BlogPostSlug) -> BlogPost:
        _response = httpx.request(
            "GET",
            urllib.parse.urljoin(f"{self._environment}/", f"blog/{slug}"),
            auth=(self._username, self._password)
            if self._username is not None and self._password is not None
            else None,
            timeout=60,
        )
        if 200 <= _response.status_code < 300:
            return pydantic.parse_obj_as(BlogPost, _response.json())  # type: ignore
        if _response.status_code == 404:
            raise BlogPostDoesNotExistError(pydantic.parse_obj_as(BlogPostSlug, _response.json()))  # type: ignore
        if _response.status_code == 404:
            raise NotFoundError()
        if _response.status_code == 400:
            raise BadRequestError()
        try:
            _response_json = _response.json()
        except JSONDecodeError:
            raise ApiError(status_code=_response.status_code, body=_response.text)
        raise ApiError(status_code=_response.status_code, body=_response_json)

    def create_blog_post(self, *, request: CreateBlogPostRequest) -> BlogPostSlug:
        _response = httpx.request(
            "POST",
            urllib.parse.urljoin(f"{self._environment}/", "blog"),
            json=jsonable_encoder(request),
            auth=(self._username, self._password)
            if self._username is not None and self._password is not None
            else None,
            timeout=60,
        )
        if 200 <= _response.status_code < 300:
            return pydantic.parse_obj_as(BlogPostSlug, _response.json())  # type: ignore
        if _response.status_code == 404:
            raise NotFoundError()
        if _response.status_code == 400:
            raise BadRequestError()
        try:
            _response_json = _response.json()
        except JSONDecodeError:
            raise ApiError(status_code=_response.status_code, body=_response.text)
        raise ApiError(status_code=_response.status_code, body=_response_json)


class AsyncBlogpostClient:
    def __init__(
        self, *, environment: str, username: typing.Optional[str] = None, password: typing.Optional[str] = None
    ):
        self._environment = environment
        self._username = username
        self._password = password

    async def get_blogposts(self) -> BlogPostCollection:
        async with httpx.AsyncClient() as _client:
            _response = await _client.request(
                "GET",
                urllib.parse.urljoin(f"{self._environment}/", "blog"),
                auth=(self._username, self._password)
                if self._username is not None and self._password is not None
                else None,
                timeout=60,
            )
        if 200 <= _response.status_code < 300:
            return pydantic.parse_obj_as(BlogPostCollection, _response.json())  # type: ignore
        if _response.status_code == 404:
            raise NotFoundError()
        if _response.status_code == 400:
            raise BadRequestError()
        try:
            _response_json = _response.json()
        except JSONDecodeError:
            raise ApiError(status_code=_response.status_code, body=_response.text)
        raise ApiError(status_code=_response.status_code, body=_response_json)

    async def get_blog_post(self, slug: BlogPostSlug) -> BlogPost:
        async with httpx.AsyncClient() as _client:
            _response = await _client.request(
                "GET",
                urllib.parse.urljoin(f"{self._environment}/", f"blog/{slug}"),
                auth=(self._username, self._password)
                if self._username is not None and self._password is not None
                else None,
                timeout=60,
            )
        if 200 <= _response.status_code < 300:
            return pydantic.parse_obj_as(BlogPost, _response.json())  # type: ignore
        if _response.status_code == 404:
            raise BlogPostDoesNotExistError(pydantic.parse_obj_as(BlogPostSlug, _response.json()))  # type: ignore
        if _response.status_code == 404:
            raise NotFoundError()
        if _response.status_code == 400:
            raise BadRequestError()
        try:
            _response_json = _response.json()
        except JSONDecodeError:
            raise ApiError(status_code=_response.status_code, body=_response.text)
        raise ApiError(status_code=_response.status_code, body=_response_json)

    async def create_blog_post(self, *, request: CreateBlogPostRequest) -> BlogPostSlug:
        async with httpx.AsyncClient() as _client:
            _response = await _client.request(
                "POST",
                urllib.parse.urljoin(f"{self._environment}/", "blog"),
                json=jsonable_encoder(request),
                auth=(self._username, self._password)
                if self._username is not None and self._password is not None
                else None,
                timeout=60,
            )
        if 200 <= _response.status_code < 300:
            return pydantic.parse_obj_as(BlogPostSlug, _response.json())  # type: ignore
        if _response.status_code == 404:
            raise NotFoundError()
        if _response.status_code == 400:
            raise BadRequestError()
        try:
            _response_json = _response.json()
        except JSONDecodeError:
            raise ApiError(status_code=_response.status_code, body=_response.text)
        raise ApiError(status_code=_response.status_code, body=_response_json)