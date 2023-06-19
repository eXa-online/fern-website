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
from ......fixtures.resources.article.types.article import Article
from ......fixtures.resources.article.types.article_collection import ArticleCollection
from ......fixtures.resources.article.types.article_slug import ArticleSlug
from ......fixtures.resources.article.types.creat_article_request import CreatArticleRequest
from .errors.article_does_not_exist_error import ArticleDoesNotExistError


class ArticleClient:
    def __init__(
        self, *, environment: str, username: typing.Optional[str] = None, password: typing.Optional[str] = None
    ):
        self._environment = environment
        self._username = username
        self._password = password

    def get_articles(self) -> ArticleCollection:
        _response = httpx.request(
            "GET",
            urllib.parse.urljoin(f"{self._environment}/", "articles"),
            auth=(self._username, self._password)
            if self._username is not None and self._password is not None
            else None,
            timeout=60,
        )
        if 200 <= _response.status_code < 300:
            return pydantic.parse_obj_as(ArticleCollection, _response.json())  # type: ignore
        if _response.status_code == 404:
            raise NotFoundError()
        if _response.status_code == 400:
            raise BadRequestError()
        try:
            _response_json = _response.json()
        except JSONDecodeError:
            raise ApiError(status_code=_response.status_code, body=_response.text)
        raise ApiError(status_code=_response.status_code, body=_response_json)

    def get_article(self, slug: ArticleSlug) -> Article:
        _response = httpx.request(
            "GET",
            urllib.parse.urljoin(f"{self._environment}/", f"articles/{slug}"),
            auth=(self._username, self._password)
            if self._username is not None and self._password is not None
            else None,
            timeout=60,
        )
        if 200 <= _response.status_code < 300:
            return pydantic.parse_obj_as(Article, _response.json())  # type: ignore
        if _response.status_code == 404:
            raise ArticleDoesNotExistError(pydantic.parse_obj_as(ArticleSlug, _response.json()))  # type: ignore
        if _response.status_code == 404:
            raise NotFoundError()
        if _response.status_code == 400:
            raise BadRequestError()
        try:
            _response_json = _response.json()
        except JSONDecodeError:
            raise ApiError(status_code=_response.status_code, body=_response.text)
        raise ApiError(status_code=_response.status_code, body=_response_json)

    def create_article(self, *, request: CreatArticleRequest) -> ArticleSlug:
        _response = httpx.request(
            "POST",
            urllib.parse.urljoin(f"{self._environment}/", "articles"),
            json=jsonable_encoder(request),
            auth=(self._username, self._password)
            if self._username is not None and self._password is not None
            else None,
            timeout=60,
        )
        if 200 <= _response.status_code < 300:
            return pydantic.parse_obj_as(ArticleSlug, _response.json())  # type: ignore
        if _response.status_code == 404:
            raise NotFoundError()
        if _response.status_code == 400:
            raise BadRequestError()
        try:
            _response_json = _response.json()
        except JSONDecodeError:
            raise ApiError(status_code=_response.status_code, body=_response.text)
        raise ApiError(status_code=_response.status_code, body=_response_json)


class AsyncArticleClient:
    def __init__(
        self, *, environment: str, username: typing.Optional[str] = None, password: typing.Optional[str] = None
    ):
        self._environment = environment
        self._username = username
        self._password = password

    async def get_articles(self) -> ArticleCollection:
        async with httpx.AsyncClient() as _client:
            _response = await _client.request(
                "GET",
                urllib.parse.urljoin(f"{self._environment}/", "articles"),
                auth=(self._username, self._password)
                if self._username is not None and self._password is not None
                else None,
                timeout=60,
            )
        if 200 <= _response.status_code < 300:
            return pydantic.parse_obj_as(ArticleCollection, _response.json())  # type: ignore
        if _response.status_code == 404:
            raise NotFoundError()
        if _response.status_code == 400:
            raise BadRequestError()
        try:
            _response_json = _response.json()
        except JSONDecodeError:
            raise ApiError(status_code=_response.status_code, body=_response.text)
        raise ApiError(status_code=_response.status_code, body=_response_json)

    async def get_article(self, slug: ArticleSlug) -> Article:
        async with httpx.AsyncClient() as _client:
            _response = await _client.request(
                "GET",
                urllib.parse.urljoin(f"{self._environment}/", f"articles/{slug}"),
                auth=(self._username, self._password)
                if self._username is not None and self._password is not None
                else None,
                timeout=60,
            )
        if 200 <= _response.status_code < 300:
            return pydantic.parse_obj_as(Article, _response.json())  # type: ignore
        if _response.status_code == 404:
            raise ArticleDoesNotExistError(pydantic.parse_obj_as(ArticleSlug, _response.json()))  # type: ignore
        if _response.status_code == 404:
            raise NotFoundError()
        if _response.status_code == 400:
            raise BadRequestError()
        try:
            _response_json = _response.json()
        except JSONDecodeError:
            raise ApiError(status_code=_response.status_code, body=_response.text)
        raise ApiError(status_code=_response.status_code, body=_response_json)

    async def create_article(self, *, request: CreatArticleRequest) -> ArticleSlug:
        async with httpx.AsyncClient() as _client:
            _response = await _client.request(
                "POST",
                urllib.parse.urljoin(f"{self._environment}/", "articles"),
                json=jsonable_encoder(request),
                auth=(self._username, self._password)
                if self._username is not None and self._password is not None
                else None,
                timeout=60,
            )
        if 200 <= _response.status_code < 300:
            return pydantic.parse_obj_as(ArticleSlug, _response.json())  # type: ignore
        if _response.status_code == 404:
            raise NotFoundError()
        if _response.status_code == 400:
            raise BadRequestError()
        try:
            _response_json = _response.json()
        except JSONDecodeError:
            raise ApiError(status_code=_response.status_code, body=_response.text)
        raise ApiError(status_code=_response.status_code, body=_response_json)