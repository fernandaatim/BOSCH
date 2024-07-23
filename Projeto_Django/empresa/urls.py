from django.contrib import admin
from django.urls import path, include
from django.urls import path
from django.shortcuts import redirect


urlpatterns = [
    path('admin/', admin.site.urls),
    path('clientes/', include('clientes.urls')),
    path('funcionarios/', include('funcionarios.urls')),
    path('inicio/',include('inicio.urls')),
    path('produtos/', include('produtos.urls')),
    path('login/', include('login.urls')),
    path('', lambda request: redirect('user_login'), name='home'),
]