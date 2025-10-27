from abc import ABC, abstractmethod

class Pizza(ABC):
    @abstractmethod
    def prepare(self): pass

    @abstractmethod
    def bake(self): pass

    @abstractmethod
    def box(self): pass