# This file was auto-generated by Fern from our API Definition.

import abc
import functools
import inspect
import logging
import typing

import fastapi

from ........core.abstract_fern_service import AbstractFernService
from ........core.exceptions.fern_http_exception import FernHTTPException
from ........core.route_args import get_route_args
from .......commons.errors.bad_request_error import BadRequestError
from .......commons.errors.not_found_error import NotFoundError
from .......fixtures.resources.article.types.article import Article
from .......fixtures.resources.article.types.article_collection import ArticleCollection
from .......fixtures.resources.article.types.article_slug import ArticleSlug
from .......fixtures.resources.article.types.creat_article_request import CreatArticleRequest
from ..errors.article_does_not_exist_error import ArticleDoesNotExistError


class AbstractWebsiteV1ArticleService(AbstractFernService):
    """
    AbstractWebsiteV1ArticleService is an abstract class containing the methods that you should implement.

    Each method is associated with an API route, which will be registered
    with FastAPI when you register your implementation using Fern's register()
    function.
    """

    @abc.abstractmethod
    def get_articles(self) -> ArticleCollection:
        """
        Retrieve all articles from the content store
        """
        ...

    @abc.abstractmethod
    def get_article(self, *, slug: str) -> Article:
        """
        Retrieve an article from the content store based on its slug
        """
        ...

    @abc.abstractmethod
    def create_article(self, *, body: CreatArticleRequest) -> ArticleSlug:
        """
        Add a new article to the content store
        """
        ...

    """
    Below are internal methods used by Fern to register your implementation.
    You can ignore them.
    """

    @classmethod
    def _init_fern(cls, router: fastapi.APIRouter) -> None:
        cls.__init_get_articles(router=router)
        cls.__init_get_article(router=router)
        cls.__init_create_article(router=router)

    @classmethod
    def __init_get_articles(cls, router: fastapi.APIRouter) -> None:
        endpoint_function = inspect.signature(cls.get_articles)
        new_parameters: typing.List[inspect.Parameter] = []
        for index, (parameter_name, parameter) in enumerate(endpoint_function.parameters.items()):
            if index == 0:
                new_parameters.append(parameter.replace(default=fastapi.Depends(cls)))
            else:
                new_parameters.append(parameter)
        setattr(cls.get_articles, "__signature__", endpoint_function.replace(parameters=new_parameters))

        @functools.wraps(cls.get_articles)
        def wrapper(*args: typing.Any, **kwargs: typing.Any) -> ArticleCollection:
            try:
                return cls.get_articles(*args, **kwargs)
            except (NotFoundError, BadRequestError) as e:
                raise e
            except FernHTTPException as e:
                logging.getLogger(f"{cls.__module__}.{cls.__name__}").warn(
                    f"Endpoint 'get_articles' unexpectedly threw {e.__class__.__name__}. "
                    + f"If this was intentional, please add {e.__class__.__name__} to "
                    + "the endpoint's errors list in your Fern Definition."
                )
                raise e

        # this is necessary for FastAPI to find forward-ref'ed type hints.
        # https://github.com/tiangolo/fastapi/pull/5077
        wrapper.__globals__.update(cls.get_articles.__globals__)

        router.get(
            path="/articles",
            response_model=ArticleCollection,
            description=AbstractWebsiteV1ArticleService.get_articles.__doc__,
            **get_route_args(cls.get_articles, default_tag="website.v_1.article"),
        )(wrapper)

    @classmethod
    def __init_get_article(cls, router: fastapi.APIRouter) -> None:
        endpoint_function = inspect.signature(cls.get_article)
        new_parameters: typing.List[inspect.Parameter] = []
        for index, (parameter_name, parameter) in enumerate(endpoint_function.parameters.items()):
            if index == 0:
                new_parameters.append(parameter.replace(default=fastapi.Depends(cls)))
            elif parameter_name == "slug":
                new_parameters.append(parameter.replace(default=fastapi.Path(...)))
            else:
                new_parameters.append(parameter)
        setattr(cls.get_article, "__signature__", endpoint_function.replace(parameters=new_parameters))

        @functools.wraps(cls.get_article)
        def wrapper(*args: typing.Any, **kwargs: typing.Any) -> Article:
            try:
                return cls.get_article(*args, **kwargs)
            except (ArticleDoesNotExistError, NotFoundError, BadRequestError) as e:
                raise e
            except FernHTTPException as e:
                logging.getLogger(f"{cls.__module__}.{cls.__name__}").warn(
                    f"Endpoint 'get_article' unexpectedly threw {e.__class__.__name__}. "
                    + f"If this was intentional, please add {e.__class__.__name__} to "
                    + "the endpoint's errors list in your Fern Definition."
                )
                raise e

        # this is necessary for FastAPI to find forward-ref'ed type hints.
        # https://github.com/tiangolo/fastapi/pull/5077
        wrapper.__globals__.update(cls.get_article.__globals__)

        router.get(
            path="/articles/{slug}",
            response_model=Article,
            description=AbstractWebsiteV1ArticleService.get_article.__doc__,
            **get_route_args(cls.get_article, default_tag="website.v_1.article"),
        )(wrapper)

    @classmethod
    def __init_create_article(cls, router: fastapi.APIRouter) -> None:
        endpoint_function = inspect.signature(cls.create_article)
        new_parameters: typing.List[inspect.Parameter] = []
        for index, (parameter_name, parameter) in enumerate(endpoint_function.parameters.items()):
            if index == 0:
                new_parameters.append(parameter.replace(default=fastapi.Depends(cls)))
            elif parameter_name == "body":
                new_parameters.append(parameter.replace(default=fastapi.Body(...)))
            else:
                new_parameters.append(parameter)
        setattr(cls.create_article, "__signature__", endpoint_function.replace(parameters=new_parameters))

        @functools.wraps(cls.create_article)
        def wrapper(*args: typing.Any, **kwargs: typing.Any) -> ArticleSlug:
            try:
                return cls.create_article(*args, **kwargs)
            except (NotFoundError, BadRequestError) as e:
                raise e
            except FernHTTPException as e:
                logging.getLogger(f"{cls.__module__}.{cls.__name__}").warn(
                    f"Endpoint 'create_article' unexpectedly threw {e.__class__.__name__}. "
                    + f"If this was intentional, please add {e.__class__.__name__} to "
                    + "the endpoint's errors list in your Fern Definition."
                )
                raise e

        # this is necessary for FastAPI to find forward-ref'ed type hints.
        # https://github.com/tiangolo/fastapi/pull/5077
        wrapper.__globals__.update(cls.create_article.__globals__)

        router.post(
            path="/articles",
            response_model=ArticleSlug,
            description=AbstractWebsiteV1ArticleService.create_article.__doc__,
            **get_route_args(cls.create_article, default_tag="website.v_1.article"),
        )(wrapper)
